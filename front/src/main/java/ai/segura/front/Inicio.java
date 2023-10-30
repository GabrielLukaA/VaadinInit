package ai.segura.front;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.apache.coyote.http11.Http11InputBuffer;

import com.vaadin.flow.component.html.H1;

@Route(value = "/inicio", layout = NavBarApp.class)
public class Inicio extends VerticalLayout {

    public Inicio(){
        H1 title = new H1("Inicio, bem vindo");
        add(
                title
        );
    }
}
