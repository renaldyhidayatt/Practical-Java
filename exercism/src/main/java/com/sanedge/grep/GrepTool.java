package com.sanedge.grep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GrepTool {
  private static final String INVERT_MATCH_FLAG = "-v";
  private static final String CASE_INSENSITIVE_FLAG = "-i";
  private static final String MATCH_ENTIRE_LINE_FLAG = "-x";
  private static final String ONLY_FILE_NAME_FLAG = "-l";
  private static final String ADD_LINE_NUM_FLAG = "-n";

  String grep(String pattern, List<String> flags, List<String> files) {
    boolean prependFileName = files.size() > 1;

    return files
        .stream()
        .map(file -> matchPattern(pattern, flags, file, prependFileName))
        .flatMap(Collection::stream)
        .collect(Collectors.joining("\n"));
  }

  private List<String> matchPattern(String pattern, List<String> flags, String file, boolean prependFileName) {
    try {
      var lines = Files.readAllLines(Paths.get(file));

      return IntStream.range(0, lines.size())
          .filter(idx -> filterLineByFlag(pattern, flags, idx, lines))
          .mapToObj(idx -> mapToLineAndPrepend(flags, file, prependFileName, idx, lines.get(idx)))
          .distinct()
          .toList();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private boolean filterLineByFlag(String pattern, List<String> flags, int idx, List<String> lines) {
    var line = lines.get(idx);

    if (flags.contains(INVERT_MATCH_FLAG))
      return !line.contains(pattern);
    else if (flags.contains(MATCH_ENTIRE_LINE_FLAG)) {
      if (flags.contains(CASE_INSENSITIVE_FLAG))
        return line.equalsIgnoreCase(pattern);
      else
        return line.equals(pattern);
    } else if (flags.contains(CASE_INSENSITIVE_FLAG))
      return line.toLowerCase().contains(pattern.toLowerCase());
    else
      return line.contains(pattern);
  }

  private String mapToLineAndPrepend(List<String> flags, String file, boolean prependFileName, int lineNumber,
      String line) {
    if (flags.contains(ONLY_FILE_NAME_FLAG))
      return file;

    var sb = new StringBuilder();

    if (prependFileName)

      sb.append(file).append(":");

    if (flags.contains(ADD_LINE_NUM_FLAG))
      sb.append(lineNumber + 1).append(":");
    if (sb.isEmpty()) {
      return line;
    } else {
      return sb.append(line).toString();
    }
  }
}
