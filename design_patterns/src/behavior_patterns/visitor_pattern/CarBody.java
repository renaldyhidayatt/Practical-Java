package behavior_patterns.visitor_pattern;

public class CarBody implements VehiclePart {
    @Override
    public void accept(VechiclePartVisitor vechiclePartVisitor) {
        vechiclePartVisitor.visit(this);
    }
}
