import java.util.Comparator;

public class MemberSortingComparator implements Comparator<Member> {
    @Override
    public int compare(Member member1, Member member2) {
        int compareVIP = member1.getVIP().compareTo(member2.getVIP()) * (-1);
        int compareDate = member1.getDate().compareTo(member2.getDate());
        int compareTime = member1.getTime().compareTo(member2.getTime());

        if (compareVIP == 0) {
            return (compareDate == 0) ? compareTime : compareDate;
        }
        return compareVIP;
    }
}
