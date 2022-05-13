package appointment;

import java.io.File;
import java.io.IOException;

public class Dentist {

    public static void main(String[] args) {
        File file = new File("Appointment.txt");

        //是否存在
        if (file.exists()) {

            File nameto = new File("New appointment.txt");
            file.renameTo(nameto);
            //文件
            System.out.println(file.isFile());
            //路径(文件夹)
            System.out.println(file.isDirectory());
        }else {
            System.out.println("文件不存在");
            try {
                //创建文件
                file.createNewFile();
                System.out.println("文件已经成功创建");
            } catch (IOException e) {
                System.out.println("文件无法创建");
            }
        }

    }

}