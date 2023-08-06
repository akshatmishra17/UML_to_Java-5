import java.util.ArrayList;
import java.util.List;

public class MaterialClass {
    private List<MaterialClassProperty> properties = new ArrayList<>();
    private List<MaterialClass> includesPropertiesOf = new ArrayList<>();
    private List<MaterialClass> isAssembledFrom = new ArrayList<>();

    public void addProperty(MaterialClassProperty property) {
        properties.add(property);
    }

    public void addIncludesPropertiesOf(MaterialClass materialClass) {
        includesPropertiesOf.add(materialClass);
    }

    public void addIsAssembledFrom(MaterialClass materialClass) {
        isAssembledFrom.add(materialClass);
    }

    public List<MaterialClassProperty> getProperties() {
        return properties;
    }

    public List<MaterialClass> getIncludesPropertiesOf() {
        return includesPropertiesOf;
    }

    public List<MaterialClass> getIsAssembledFrom() {
        return isAssembledFrom;
    }
}
