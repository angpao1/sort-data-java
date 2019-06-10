import java.util.*;

public class MemberSortingTest {


    public static void main(String[] args) {
        List<Member> listOfMembers = new ArrayList<Member>();

        Member member1 = new Member("Y", "30/05/11-11:33:20", "A", "9162A21303", "ดช.เก่งกล้า มากมาย", "22822882", "01", "N", "987", "9004041", "25620401", "100012");
        Member member2 = new Member("N", "30/05/11-11:33:20", "D", "9162A21313", "พญ.สมหญิง สมหญิง", "22822882", "01", "N", "987", "9004041", "25620402", "100022");
        Member member3 = new Member("Y", "30/05/11-11:33:20", "A", "9162A21323", "ดช.เก่งกล้า มากมาย", "22822882", "01", "N", "987", "9004041", "25620403", "100032");
        Member member4 = new Member("N", "30/05/11-11:33:20", "D", "9162A21333", "Mr.Doc doctor", "22822882", "01", "N", "987", "9004041", "25620404", "100042");
        Member member5 = new Member("Y", "30/05/11-11:33:20", "A", "9162A21343", "Mr.Doc doctor", "22822882", "01", "N", "987", "9004041", "25620405", "100052");
        Member member6 = new Member("N", "30/05/11-11:33:20", "D", "9162A21353", "พญ.สมหญิง สมหญิง", "22822882", "01", "N", "987", "9004041", "25620406", "100022");
        Member member7 = new Member("Y", "30/05/11-11:33:20", "A", "9162A21363", "ดญ.ศรีสุข ศรีสุข", "22822882", "01", "N", "987", "9004041", "25620407", "100512");
        Member member8 = new Member("N", "30/05/11-11:33:20", "D", "9162A21373", "Mr.Doc doctor", "22822882", "01", "N", "987", "9004041", "25620408", "100642");
        Member member9 = new Member("Y", "30/05/11-11:33:20", "A", "9162A21383", "พญ.สมหญิง สมหญิง", "22822882", "01", "N", "987", "9004041", "25620409", "100742");
        Member member10 = new Member("N", "30/05/11-11:33:20", "D", "9162A21393", "ดช.เก่งกล้า มากมาย", "22822882", "01", "N", "987", "9004041", "25620411", "115342");

        listOfMembers.add(member1);
        listOfMembers.add(member2);
        listOfMembers.add(member3);
        listOfMembers.add(member4);
        listOfMembers.add(member5);
        listOfMembers.add(member6);
        listOfMembers.add(member7);
        listOfMembers.add(member8);
        listOfMembers.add(member9);
        listOfMembers.add(member10);

        Iterator<Member> memberIterator = listOfMembers.iterator();

        System.out.println("Before Sort");
        while (memberIterator.hasNext()) {
            System.out.println(memberIterator.next());
        }

        MemberSortingComparator memberSortingComparator = new MemberSortingComparator();
        Collections.sort(listOfMembers, memberSortingComparator);

        List<Member> unsortMemberVIP = new ArrayList<>();
        List<Member> unsortMemberNoVIP = new ArrayList<>();
        for (Member member : listOfMembers) {
            if (member.getVIP().equals("Y")) {
                unsortMemberVIP.add(member);
            }
            if (member.getVIP().equals("N")) {
                unsortMemberNoVIP.add(member);
            }
        }

        List<Member> result = new ArrayList<>();
        result.addAll(SortByName(listOfMembers, unsortMemberVIP));
        result.addAll(SortByName(listOfMembers, unsortMemberNoVIP));

        System.out.println("\n\nAfter sorting");
        for (Member member : result) {
            System.out.println(member);
        }
    }

    public static List SortByName(List<Member> listOfMembers, List<Member> memberFlag) {
        List<String> listDistincts = new ArrayList<>(listOfMembers.size());
        List<Member> sortMember = new ArrayList<>();
        for (Member member : memberFlag) {
            if (!listDistincts.contains(member.getInsuredName())) {
                listDistincts.add(member.getInsuredName());
            }
        }
        for (String name : listDistincts) {
            for (Member orderMember : memberFlag) {
                if (orderMember.getInsuredName().equals(name)) {
                    sortMember.add(orderMember);
                }
            }
        }
        return sortMember;
    }
}





