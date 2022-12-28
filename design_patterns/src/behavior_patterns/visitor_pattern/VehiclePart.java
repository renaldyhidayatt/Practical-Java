package behavior_patterns.visitor_pattern;

public interface VehiclePart {
    void accept(VechiclePartVisitor vechiclePartVisitor);
}
