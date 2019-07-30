class BitwiseOp{
    public static void main(String[] args)
    {
        boolean a = false;
        boolean b = true;
        boolean c = false;

        if(a & b | b & c | c )
            System.out.println("ok");
        if(a & b | b & c | b | c)
            System.out.println("yes");
    }
}
