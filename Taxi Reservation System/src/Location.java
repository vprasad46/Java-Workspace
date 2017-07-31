public enum Location{
    
    A(0){
        @Override
        public Location previous(){return null;}
    },B(15),C(30),D(45),E(60),F(75){
        @Override
        public Location next(){return null;}
    };
    
    int value;
    private Location(int value){this.value= value;}
    
    public Location next(){return values()[ordinal()+1];}
    public Location previous(){return values()[ordinal()-1];}
    
    
}