public enum Type {
    Convertible("Convertible"),
    Coupe("Coupe"),
    Hatchback("Hatchback"),
    Sedun("Sedun"),
    SUV("SUV"),
    Van("Van");

    private String type;

    Type(String type){
        this.type= type;
    }
    public String getString(String type){
        return type;
    }
}