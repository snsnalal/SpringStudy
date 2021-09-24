package seongho.seonghospring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import seongho.seonghospring.repsitory.MemberRepository;
import seongho.seonghospring.repsitory.MemoryMemberRepository;

@Configuration
public class SpringConfig
{
    @Bean
    public MemberService memberService()
    {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository()
    {
        return new MemoryMemberRepository();
    }
}
