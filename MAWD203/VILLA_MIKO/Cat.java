public class Cat {
    
    private String catType;
    private int cutenessLvl;

    
    public Cat() {
        this.catType = "Unknown";
        this.cutenessLvl = 3;
    }

    
    public Cat(String type, int lvl) {
        this.catType = type;
        this.cutenessLvl = lvl;
    }

    
    public int getCuteness() {
        return this.cutenessLvl;
    }

    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        System.out.println("Cat1 Type: " + cat1.catType + ", Cuteness Level: " + cat1.getCuteness());

        
        Cat cat2 = new Cat("Siamese", 8);
        System.out.println("Cat2 Type: " + cat2.catType + ", Cuteness Level: " + cat2.getCuteness());
    }
}
