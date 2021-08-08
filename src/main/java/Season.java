public enum Season {
    Spring("Xuan"),
    winter("Dong"),
    summer("Ha"),
    autum("Thu");
    String value;
    Season(String value){
        this.value = value;
    }
    public  String getValue(){
        return this.value;
    }
}

