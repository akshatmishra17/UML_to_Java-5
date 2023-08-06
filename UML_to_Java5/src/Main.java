import java.util.List;

public class Main {
    public static void main(String[] args) {

        MaterialDefinition mat1Definition = new MaterialDefinition();
        mat1Definition.addProperty(new MaterialDefinitionProperty("Density", "8 g/cm^3"));
        mat1Definition.addProperty(new MaterialDefinitionProperty("Tensile Strength", "300 MPa"));

        MaterialDefinition mat2Definition = new MaterialDefinition();
        mat2Definition.addProperty(new MaterialDefinitionProperty("Density", "1 g/cm^3"));
        mat2Definition.addProperty(new MaterialDefinitionProperty("Tensile Strength", "100 MPa"));

        MaterialClass mat1Class = new MaterialClass();
        mat1Class.addProperty(new MaterialClassProperty("Name", "Steel"));
        mat1Class.addProperty(new MaterialClassProperty("Type", "Metallic Substance"));

        MaterialClass mat2Class = new MaterialClass();
        mat2Class.addProperty(new MaterialClassProperty("Name", "Wood"));
        mat2Class.addProperty(new MaterialClassProperty("Type", "Natural Substance"));

        MaterialLot mat1Lot = new MaterialLot(mat1Definition);
        MaterialLot mat2Lot = new MaterialLot(mat2Definition);

        MaterialSublot mat1Sublot1 = new MaterialSublot();
        MaterialSublot mat1Sublot2 = new MaterialSublot();
        mat1Lot.addIsMadeUpOf(mat1Sublot1);
        mat1Lot.addIsMadeUpOf(mat1Sublot2);

        MaterialSublot mat2Sublot1 = new MaterialSublot();
        MaterialSublot mat2Sublot2 = new MaterialSublot();
        mat2Lot.addIsMadeUpOf(mat2Sublot1);
        mat2Lot.addIsMadeUpOf(mat2Sublot2);

        System.out.println("Material Definition Properties:");
        List<MaterialDefinitionProperty> mat1DefinitionProperties = mat1Definition.getProperties();
        for (int i = 0; i < mat1DefinitionProperties.size(); i++) {
            MaterialDefinitionProperty property = mat1DefinitionProperties.get(i);
            System.out.println("MAT1 - " + property.getName() + ": " + property.getValue());
        }

        List<MaterialDefinitionProperty> mat2DefinitionProperties = mat2Definition.getProperties();
        for (int i = 0; i < mat2DefinitionProperties.size(); i++) {
            MaterialDefinitionProperty property = mat2DefinitionProperties.get(i);
            System.out.println("MAT2 - " + property.getName() + ": " + property.getValue());
        }
        System.out.println();
        System.out.println("Material Class Properties:");
        List<MaterialClassProperty> mat1ClassProperties = mat1Class.getProperties();
        for (int i = 0; i < mat1ClassProperties.size(); i++) {
            MaterialClassProperty property = mat1ClassProperties.get(i);
            System.out.println("MAT1 - " + property.getName() + ": " + property.getDescription());
        }

        List<MaterialClassProperty> mat2ClassProperties = mat2Class.getProperties();
        for (int i = 0; i < mat2ClassProperties.size(); i++) {
            MaterialClassProperty property = mat2ClassProperties.get(i);
            System.out.println("MAT2 - " + property.getName() + ": " + property.getDescription());
        }
        System.out.println();
        System.out.println("Material Lot Properties:");
        System.out.println("MAT1 - Defined by Material Definition");
        System.out.println("MAT2 - Defined by Material Definition");

        System.out.println();
        System.out.println("Material Sublot Properties:");
        List<MaterialSublot> mat1Sublots = mat1Lot.getIsMadeUpOf();
        for (int i = 0; i < mat1Sublots.size(); i++) {
            MaterialSublot sublot = mat1Sublots.get(i);
            System.out.println("MAT1 - is Assembled From Material Sublot " + (i + 1));
        }

        List<MaterialSublot> mat2Sublots = mat2Lot.getIsMadeUpOf();
        for (int i = 0; i < mat2Sublots.size(); i++) {
            MaterialSublot sublot = mat2Sublots.get(i);
            System.out.println("MAT2 - is Assembled From Material Sublot " + (i + 1));
        }
    }
}