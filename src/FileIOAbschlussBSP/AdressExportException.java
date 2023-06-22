package FileIOAbschlussBSP;

public class AdressExportException extends Exception{

    public AdressExportException(String message, Throwable cause) {
        super(message, cause);
    }

    public class AdressLoadException extends Exception{
        public AdressLoadException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
