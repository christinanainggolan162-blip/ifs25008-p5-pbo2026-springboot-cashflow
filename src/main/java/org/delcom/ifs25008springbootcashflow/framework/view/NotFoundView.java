package org.delcom.ifs25008springbootcashflow.framework.view;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.ErrorParameter;
import com.vaadin.flow.router.HasErrorParameter;
import com.vaadin.flow.router.NotFoundException;
import com.vaadin.flow.router.PageTitle;
import jakarta.servlet.http.HttpServletResponse;

@PageTitle("Halaman Tidak Ditemukan | Cashflow")
public class NotFoundView extends Main implements HasErrorParameter<NotFoundException> {

    @Override
    public int setErrorParameter(BeforeEnterEvent event, ErrorParameter<NotFoundException> parameter) {
        removeAll();
        add(new H1("Halaman tidak ditemukan"),
                new Paragraph("Alamat yang Anda buka tidak tersedia."),
                new Anchor("", "Kembali ke beranda"));
        return HttpServletResponse.SC_NOT_FOUND;
    }
}