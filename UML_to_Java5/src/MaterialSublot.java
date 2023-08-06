import java.util.ArrayList;
import java.util.List;

public class MaterialSublot {
    private List<MaterialSublot> isAssembledFrom = new ArrayList<>();
    private List<MaterialSublot> isMadeUpOfFrom = new ArrayList<>();

    public void addIsAssembledFrom(MaterialSublot sublot) {
        isAssembledFrom.add(sublot);
    }

    public void addIsMadeUpOfFrom(MaterialSublot sublot) {
        isMadeUpOfFrom.add(sublot);
    }

    public List<MaterialSublot> getIsAssembledFrom() {
        return isAssembledFrom;
    }

    public List<MaterialSublot> getIsMadeUpOfFrom() {
        return isMadeUpOfFrom;
    }
}
