import java.util.List;
import java.util.ArrayList;

public class MaterialLotProperty {
    private List<MaterialSublot> contains = new ArrayList<>();
    private List<MaterialSublot> hasValuesOf = new ArrayList<>();
    private MaterialLot hasValuesOfLot;

    public void addContains(MaterialSublot sublot) {
        contains.add(sublot);
    }

    public void addHasValuesOf(MaterialSublot sublot) {
        hasValuesOf.add(sublot);
    }

    public void addHasValuesOfLot(MaterialLot lot) {
        hasValuesOfLot = lot;
    }

    public List<MaterialSublot> getContains() {
        return contains;
    }

    public List<MaterialSublot> getHasValuesOf() {
        return hasValuesOf;
    }

    public MaterialLot getHasValuesOfLot() {
        return hasValuesOfLot;
    }
}
