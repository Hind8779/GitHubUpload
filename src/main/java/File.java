public abstract class File {
    private String fileName;
    private int fileSize;

    public File(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;

    }

    public abstract void open();

    public void edit(){
        System.out.println("File can be edited");
    }
    public void close (){
        System.out.println("File can be closed");
    }
}
class javaFile extends File{
    public javaFile (String fileName, int fileSize) {
        super(fileName, fileSize);
    }
   @Override

   public void open(){

       System.out.println("to open java file we need notepad++");
   }


}
class wordFile extends File{

        public wordFile (String fileName, int fileSize) {
            super(fileName, fileSize);}

    @Override
    public void open(){

        System.out.println("to open word file we need Microsoft");
    }
}
class pdffile extends File{

    public pdffile (String fileName, int fileSize) {
        super(fileName, fileSize);}
    @Override
    public void open(){

        System.out.println("to open pdf file we need acrobat++");
    }
}