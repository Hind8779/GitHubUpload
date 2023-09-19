public class fileTester {
    public static void main(String[] args) {
        File []arr={new wordFile("word",65), new javaFile("java",50),new pdffile("pdf",69) };
        for(File  a:arr) {
            a.open();
            a.edit();
            a.close();
        }
    }
}
