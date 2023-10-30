package ai.segura.front;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.apache.coyote.http11.Http11InputBuffer;

import com.vaadin.flow.component.html.H1;

@Route(value = "/perfil", layout = NavBarApp.class)
public class Perfil extends VerticalLayout {

    public Perfil(){
        H1 title = new H1("Perfil, bem vindo");
        add(
            title
        );
    }
}
