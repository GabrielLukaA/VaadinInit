package ai.segura.front;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.apache.coyote.http11.Http11InputBuffer;

import com.vaadin.flow.component.html.H1;
@Route(value = "/seguradoras", layout = NavBarApp.class)
public class Seguradoras extends VerticalLayout {

    public Seguradoras(){
        H1 title = new H1("Seguradoras, bem vindo");
        add(
                title
        );
    }
}
