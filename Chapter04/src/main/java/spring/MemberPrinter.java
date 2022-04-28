package spring;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MemberPrinter {
	
	private DateTimeFormatter dateTimeFormatter;
	
	// public MemberPrinter() {
		// System.out.println("생성자 실행");
		// dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
	// }
	
	public void print(Member member) {
		if(dateTimeFormatter == null) {
			System.out.printf("회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF\n",
					member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
		} else {
			System.out.printf("회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%s\n",
					member.getId(), member.getEmail(),
					member.getName(), dateTimeFormatter.format(member.getRegisterDateTime()));
		}
	}
	
	@Autowired // (required=false)
	public void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
	// public void setDateFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
		System.out.println("setDateFormatter 실행");
		System.out.println("dateTimeFormatter : " + dateTimeFormatter);
		this.dateTimeFormatter = dateTimeFormatter;			
	}
	
}
