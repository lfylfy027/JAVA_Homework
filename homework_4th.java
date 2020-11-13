package helloworld;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



public class homework_4th {
	//重写了哈希值计算的函数，实现多文件的计算
	 public static void SHA1Checksum(MessageDigest complete,InputStream is) throws Exception {
	        byte[] buffer = new byte[1024];
	        int numRead;
	        do {
	            numRead = is.read(buffer);
	            if (numRead > 0) {
	                complete.update(buffer, 0, numRead);
	            }
	        } while (numRead != -1);
	        is.close();
	    }
	 
	 
    public static byte[] dfs(String path) throws Exception {
        File dir = new File(path);
        File[] fs = dir.listFiles();
        ArrayList<File> files=new ArrayList<File>(Arrays.asList(fs));
        
        //将listfiles按名称排序，并将文件夹类型置于文件后面
        Collections.sort(files, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                if (o1.isDirectory() && o2.isFile())
                    return 1;
                if (o1.isFile() && o2.isDirectory())
                    return -1;
                return o1.getName().compareTo(o2.getName());
            }
        });
        MessageDigest complete=MessageDigest.getInstance("SHA-1");
        
        
        for(int i = 0; i < files.size(); i++) {
            
        	//判断如果是文件，就计算并更新哈希值
        	if(files.get(i).isFile()) {
                System.out.println("file " + files.get(i).getName());
                
                //对文件进行哈希值计算
                FileInputStream is = new FileInputStream(files.get(i));
                SHA1Checksum(complete, is);
                
            }
        	
        	//如果是文件夹，则递归遍历其下的文件
            if(files.get(i).isDirectory()) {
                System.out.println("directory " + files.get(i).getName());
                dfs(path + File.separator + files.get(i).getName());
            }
        }
        return complete.digest();
    }
    
    public static void main(String[] args) {
        try {
            String s = new String("test");
            byte[] sha1 = dfs(s);

            String result = "";
            for (int i = 0; i < sha1.length; i++) {
                result += Integer.toString(sha1[i], 16);
            }

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
