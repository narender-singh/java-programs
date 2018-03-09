import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

class DerivedCls extends BaseCls
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
        List<? super String> o = new ArrayList<String>();
        o.add("Narender");
        BaseCls bCls = new BaseCls();
        System.out.println("NUM : " + bCls.num);
        bCls.TryOverride();
        bCls = new DerivedCls();
        bCls.TryOverride();
        bCls.num = 100;
        System.out.println("Num Derived : " + bCls.num);

    }

    public void TryOverride() throws IOException
    {
        System.out.println("This is Derived");
    }
}
