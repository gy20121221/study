package aost;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

public class Demo3 {
    public static void main(String[] args) throws AWTException {

        Robot robot = new Robot();// ����Robot���󣨻����ˣ�
        robot.delay(4000);// �ӳ����룬��Ҫ��Ϊ��Ԥ�����򿪴��ڵ�ʱ�䣬�����ڵĵ�λΪ����
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        for (int j = 0; j < 101; j++) {//ѭ������
            String sentencet = "wdnmd" + j + "��";
            System.out.println(sentencet);
            Transferable tText = new StringSelection(sentencet);
            clip.setContents(tText, null);
            // �������а�����ctrl+v�����ճ������
            robot.keyPress(KeyEvent.VK_CONTROL);// ����Control��
            robot.keyPress(KeyEvent.VK_V);// ����V��
            robot.keyRelease(KeyEvent.VK_CONTROL);// �ͷ�ctrl��������ctrl���˸����ɾ���������Ĺ����԰������ڰ��º�һ��Ҫ�ͷţ���Ȼ������⡣crtl�����סû���ͷţ��ڰ�������ĸ�����ǣ��ó����Ļ���ctrl�Ŀ�ݼ���
            robot.delay(500);// �ӳ�һ���ٷ��ͣ���Ȼ��һ����ȫ������ȥ����Ϊ���ԵĴ����ٶȺܿ죬ÿ��ճ�����͵��ٶȼ�����һ˲�䣬���Ը��˵ĸо�����һ���Է�����ȫ�������ʱ������Լ��ģ��뼸�뷢��һ��������
            robot.keyPress(KeyEvent.VK_ENTER);// �س�
            // }
        }
    }
}

