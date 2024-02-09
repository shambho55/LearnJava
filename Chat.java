import java.time.*;
import java.time.format.DateTimeFormatter.*;
import java.time.format.*;

final class Chat{

private final String message;

private final LocalDateTime timestamp;

public Chat(String message){

this.message = message;

timestamp = LocalDateTime.now();

}

public String toString(){

String time = timestamp.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));

return time + " " + message;

}

}
