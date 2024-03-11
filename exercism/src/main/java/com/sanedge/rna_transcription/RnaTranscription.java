package com.sanedge.rna_transcription;

public class RnaTranscription {

  String transcribe(String dnaStrand) {
    String str = "";

    for (int i = 0; i < dnaStrand.length(); i++) {
      if (dnaStrand.charAt(i) == 'G')
        str += 'C';
      if (dnaStrand.charAt(i) == 'C')
        str += 'G';

      if (dnaStrand.charAt(i) == 'T')
        str += 'A';

      if (dnaStrand.charAt(i) == 'A')
        str += 'U';
    }

    return str;
  }
}
