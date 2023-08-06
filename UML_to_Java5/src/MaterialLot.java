import java.util.ArrayList;
import java.util.List;

public class MaterialLot {
    private MaterialDefinition materialDefinition;
    private List<MaterialSublot> isMadeUpOf = new ArrayList<>();
    private List<MaterialLotProperty> properties = new ArrayList<>();

    public MaterialLot(MaterialDefinition materialDefinition) {
        this.materialDefinition = materialDefinition;
    }

    public void addIsMadeUpOf(MaterialSublot sublot) {
        isMadeUpOf.add(sublot);
    }

    public void addProperty(MaterialLotProperty property) {
        properties.add(property);
    }

    public MaterialDefinition getMaterialDefinition() {
        return materialDefinition;
    }

    public List<MaterialSublot> getIsMadeUpOf() {
        return isMadeUpOf;
    }

    public List<MaterialLotProperty> getProperties() {
        return properties;
    }
}
