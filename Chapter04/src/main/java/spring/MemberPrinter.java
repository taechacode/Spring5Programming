package spring;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MemberPrinter {
	
	private DateTimeFormatter dateTimeFormatter;
	
	// public MemberPrinter() {
		// System.out.println("������ ����");
		// dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
	// }
	
	public void print(Member member) {
		if(dateTimeFormatter == null) {
			System.out.printf("ȸ�� ����: ���̵�=%d, �̸���=%s, �̸�=%s, �����=%tF\n",
					member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
		} else {
			System.out.printf("ȸ�� ����: ���̵�=%d, �̸���=%s, �̸�=%s, �����=%s\n",
					member.getId(), member.getEmail(),
					member.getName(), dateTimeFormatter.format(member.getRegisterDateTime()));
		}
	}
	
	@Autowired // (required=false)
	public void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
	// public void setDateFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
		System.out.println("setDateFormatter ����");
		System.out.println("dateTimeFormatter : " + dateTimeFormatter);
		this.dateTimeFormatter = dateTimeFormatter;			
	}
	
}