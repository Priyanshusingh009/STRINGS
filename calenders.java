import java.util.*;
public class calenders {
    public static void main(String[] args) {
       Calendar c=Calendar.getInstance();
       System.out.println("Current Date and Time :");
       System.out.format(" %te %tB, %tY%n", c, c, c);
       System.out.format(" %tl:%tM:%ts %tp%n", c, c, c,c);
/*%tH Hour (00–23) in 24-hour format

%tI → Hour (01–12) in 12-hour format (with leading zero)

%tl → Hour (1–12) in 12-hour format (without leading zero)

%tM → Minutes (00–59)

%tS → Seconds (00–59)

%tp → am/pm (lowercase)

%Tp → AM/PM (uppercase)

%tB → Full month name (e.g., August)

%tb → Abbreviated month name (e.g., Aug)

%tY → Year (4 digits, e.g., 2025)

%ty → Year (last 2 digits, e.g., 25)

%tA → Full day name (e.g., Thursday)

%ta → Abbreviated day name (e.g., Thu) */
    }
}
