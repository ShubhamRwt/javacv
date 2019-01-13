




import static org.bytedeco.javacpp.opencv_imgcodecs.cvLoadImage;
import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;


import org.bytedeco.javacpp.opencv_core;

public class Test {
    public static void main(String[] args) {

        IplImage img= cvLoadImage("CMS_Creative_164657191_Kingfisher.jpg");
        IplImage hsvimg= cvCreateImage(cvGetSize(img),IPL_DEPTH_8U,3);
        IplImage gravimg= cvCreateImage(cvGetSize(img),IPL_DEPTH_8U,3);


        cvCvtColor(img,gravimg,CV_BGR2GRAY);
        cvCvtColor(img,hsvimg,CV_BGR2HSV);

        cvShowImage("Original",img);
        cvShowImage("HSV",hsvimg);
        cvShowImage("GRAY",gravimg);
        cvWaitKey();

        cvSaveImage("Original.jpg",img);
        cvSaveImage("HSV.jpg",hsvimg);
        cvSaveImage("GRAY.jpg",gravimg);

        cvReleaseImage(img);
        cvReleaseImage(hsvimg);
        cvReleaseImage(gravimg);

    }


}