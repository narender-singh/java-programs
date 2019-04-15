class Child extends Parent{
    public Child(){
        super(x -> Do(x));
    }

    public void Do(String s){
        System.out.print(s);
    }
}

