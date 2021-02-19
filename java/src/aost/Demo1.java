package aost;

import java.io.*;
import java.nio.file.Files;
import java.text.ParseException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改文件后缀名的文件夹:");
        //String path = sc.nextLine();
        String path = "C:\\Users\\嘿嘿\\Desktop\\text\\remake\\input";

        System.out.println("请输入修改前的后缀名:");
        //String from = sc.nextLine();
        String from = "html";

        System.out.println("请输入修改后的后缀名:");
        //String to = sc.nextLine();
        String to = "txt";


        reName(path, from, to);
        System.out.println("全部修改完成!!!");

        String outputPath = "C:\\Users\\嘿嘿\\Desktop\\text\\remake\\output\\a.txt";
        read(path, outputPath);
        System.out.println("全部输出完成");

        System.out.println("是否清除修改文件,输入1清除");
        if (sc.nextInt() == 1) {
            String dePath = "C:\\Users\\嘿嘿\\Desktop\\text\\remake";
            delete(dePath);
        }

        File file = new File(outputPath);
        if (file.createNewFile()) {
            System.out.println("恢复成功");
        }

    }


    //输入文件地址，需修改的文件名，修改的文件名。结果直接改变文件
    public static void reName(String path, String from, String to) {
        File f = new File(path);
        File[] fs = f.listFiles();
        for (File subFile : fs) {
            // 如果文件是文件夹则递归调用批量更改文件后缀名的函数
            if (subFile.isDirectory()) {
                reName(subFile.getPath(), from, to);
            } else {
                String name = subFile.getName();
                if (name.endsWith(from)) {

                    subFile.renameTo(new File(subFile.getParent() + "/" + name.substring(0, name.indexOf(from)) + to));
                    /*
                     * 可在Java API中的File类中查询renameTo的方法
                     * renameTo可以用来给File改名字,改路径
                     * 他需要的参数也是一个File对象,表示要把当前文件重命名(移动)为哪个文件
                     * 如果目标文件存在,则此方法返回false
                     *
                     * renameTo不会产生新文件,他只是把文件移动一下,或者改个名字
                     *
                     * 实际上,这个方法的具体表现与操作系统,和文件系统都有关系.
                     * 它不能把一个文件从一个文件系统移动到另一个文件系统,例如: 不能把c:\a.txt renameTo 为
                     * d:\a.txt 因为c: d:属于不同的盘(文件系统) 但可以把c:\a.txt renameTo
                     * c:\system\bb.txt (路径,文件名都可以变,但还是在同一个分区)
                     * linux,unix的分区也是同样的道理,只不过不像Windows这么明显一眼就看出来不是同一个分区
                     *
                     * 你可以在系统中试一下: 在同一个分区内,剪切一个文件 ,在粘贴到另一个位置,这是瞬间完成的,无论文件多么大.
                     * 实际上没有copy操作,java的renameTo就是这个意思 不同分区的话,那就得先复制,然后删除源文件
                     */
                }
            }
        }
    }


    //将txt文件输出为一个文件
    public static void read(String inputPath, String outputPath) throws IOException {
        //定义输出目录
        String FileOut = outputPath;
        BufferedWriter bw = new BufferedWriter(new FileWriter(FileOut));

        //读取目录下的每个文件或者文件夹，并读取文件的内容写到目标文字中去
        File[] list = new File(inputPath).listFiles();
        int fileCount = 0;
        int folderConut = 0;
        for (File file : list) {
            if (file.isFile()) {
                fileCount++;
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }
                br.close();
            } else {
                folderConut++;
            }
        }
        bw.close();
        System.out.println("输入目录下文件个数为" + fileCount);
        System.out.println("输入目录下文件夹个数为" + folderConut);

    }


    public static void delete(String dePath) {
        File file = new File(dePath);
        if (!file.isDirectory() || !file.exists()) {
            file.delete();
        } else {
            File[] files = file.listFiles();
            for (File f :
                    files) {
                try {
                    delete(f.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
