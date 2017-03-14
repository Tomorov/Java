package TestVari;

import java.io.*;

import static java.lang.System.out;

/**
 * Created by Mario on 13/03/2017.
 */
public class Scrivi {

    public static void main(String[] args) throws IOException {
        //test();
        try {
            test2();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static void test() throws FileNotFoundException {
        FileOutputStream file = new FileOutputStream("cao.java");
        PrintStream Output = new PrintStream(file);
        String pack = "package TestVari;";
        pack = pack + "\n"+"\n";
        String codice = "/**\n" +
                " * Created by Mario on 13/03/2017.\n" +
                " */\n" +
                "public class ciao {\n" +
                "    public static void main(String[] args){\n" +
                "        test();\n" +
                "    }\n" +
                "\n" +
                "    public static void test(){\n" +
                "        System.out.println(\"ciao\");\n" +
                "    }\n" +
                "}\n";
        String classe = pack.concat(codice);
        Output.print(classe);
    }

    public static void shell() throws IOException {
        Runtime rt= Runtime.getRuntime();
        Process a = rt.exec(new String[]{"cmd", "/C","start", "cmd"});
        String dir = "dir";
        a.getOutputStream().write(dir.getBytes());
    }

    public static void test2() throws IOException {
        Runtime rt = Runtime.getRuntime();
        OutputStream o = null;
        Process proc;
        String[] command = new String[4];
        command[0]= "cmd";
        command[1] = "/C";
        command[2] = "start";
        command[3]= "dir";

        try {
            proc = rt.exec(command);
            o = proc.getOutputStream();
            OutputStreamWriter out = new OutputStreamWriter(o);
            OutputStream outputStream = proc.getOutputStream();
            String dir = "dir";
            outputStream.write(dir.getBytes());
            InputStream is = proc.getInputStream();
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int r;
            while ((r = is.read()) != -1)
            {
                bos.write(r);
            }

//conversione in array di byte
            byte[] data = bos.toByteArray();

//conversione in stringa
            System.out.println(new String(data));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
