import org.opencv.core.CvType;  
import org.opencv.core.Mat;  
public class Main {  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        System.loadLibrary("opencv_java320");  
        Mat m  = Mat.eye(3, 3, CvType.CV_8UC1);  
        System.out.println("m = " + m.dump());  
        
        
        DetectFaceDemo demo = new DetectFaceDemo();
        demo.run();
    }
}  