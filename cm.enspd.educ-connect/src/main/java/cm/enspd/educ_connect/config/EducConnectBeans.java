package cm.enspd.educ_connect.config;

import cm.enspd.educ_connect.domaine.demo.DemoFactory;
import cm.enspd.educ_connect.domaine.demo.DemoFetcher;
import cm.enspd.educ_connect.domaine.demo.DemoRepository;
import cm.enspd.educ_connect.domaine.demo.impl.DemoFactoryImpl;
import cm.enspd.educ_connect.domaine.demo.impl.DemoFetcherImpl;
import cm.enspd.educ_connect.repository.DemoSpringRepository;
import cm.enspd.educ_connect.repository.impl.DemoRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class EducConnectBeans {

    @Bean
    public DemoFactory demoFactory(DemoRepository demoRepository) {
        return new DemoFactoryImpl(demoRepository);
    }

    @Bean
    public DemoRepository demoRepository(DemoSpringRepository demoSpringRepository) {
        return new DemoRepositoryImpl(demoSpringRepository);
    }

    @Bean
    public DemoFetcher demoFetcher(DemoRepository demoRepository) {
        return new DemoFetcherImpl(demoRepository);
    }
}
