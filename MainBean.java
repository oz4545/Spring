import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {
    public static void main(String[] args) {
        // Cargar el archivo de configuración de Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Obtener el bean AprendizBean del contenedor
        AprendizBean aprendiz = (AprendizBean) context.getBean("aprendizBean");

        // Utilizar el bean
        aprendiz.verAprendiz();
    }
}