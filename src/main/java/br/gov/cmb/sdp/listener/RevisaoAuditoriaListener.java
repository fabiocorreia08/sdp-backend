package br.gov.cmb.sdp.listener;

import org.hibernate.envers.RevisionListener;
import org.springframework.security.core.context.SecurityContextHolder;

import br.gov.cmb.sdp.entity.RevisaoAuditoria;
import br.gov.cmb.sdp.entity.Usuario;

public class RevisaoAuditoriaListener implements RevisionListener{

	@Override
	public void newRevision(Object revisionEntity) {
		
		RevisaoAuditoria rev = (RevisaoAuditoria) revisionEntity;		 
		
	    String usuario = "sistema"; 
	    
	    try {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if (principal instanceof Usuario userDetails) {
                usuario = userDetails.getLogin();
            } else {
                usuario = principal.toString();
            }
        } catch (Exception e) {
            
        }
	    
        rev.setUsuario(usuario);
		
	}

}
