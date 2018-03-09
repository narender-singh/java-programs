class ClassImpl
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Class stringClass =  Class.forName("java.lang.String");
        Class<TempClass> temp = TempClass.class;
        TempClass t1 = new TempClass();
        Class<?> cls = t1.getClass();
        TempClass t2 = cls.newInstance();
        System.out.println( 1 + 2 + "Temp " + 1 + 2);
        TempClass t = temp.newInstance();
        System.out.println("t " + t);
        String boolClassName = boolean.class.getName();
        Class boolClass = Boolean.TYPE;
        System.out.println("stringClass" + stringClass);
        System.out.println("booleanClassName" + boolClassName);
        System.out.println("boolClass" + boolClass);
    }
}
