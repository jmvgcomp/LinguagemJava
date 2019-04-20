package ExercicioPolimorfismo.Entities;

public class ImportedProduct extends Product{
    private Double customsFree;

    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + " (Custom free: $"+ customsFree +")";
    }

}
