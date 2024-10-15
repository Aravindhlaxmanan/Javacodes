package nwknvghg;

public class StringBuffer_builder {
    public static void main(String[] args) {
        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("StringBuffer: " + stringBuffer);

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println("StringBuilder: " + stringBuilder);
    }
}


//Both StringBuffer and StringBuilder are mutable,
//meaning they allow modifications to the string content without creating new objects, unlike String.

//They share many similar methods such as append(), insert(), delete(), reverse(), and toString().



//StringBuffer: Due to its synchronized methods, StringBuffer is slower than StringBuilder when only a single thread is accessing the object.

//StringBuilder: Faster than StringBuffer because it is not synchronized. 
//This makes it the preferred choice in single-threaded environments or when thread safety is not a concern