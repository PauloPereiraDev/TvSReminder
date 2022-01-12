/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "bd_tvsr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BdTvsr.findAll", query = "SELECT b FROM BdTvsr b"),
    @NamedQuery(name = "BdTvsr.findByIdProg", query = "SELECT b FROM BdTvsr b WHERE b.idProg = :idProg"),
    @NamedQuery(name = "BdTvsr.findByNomeProg", query = "SELECT b FROM BdTvsr b WHERE b.nomeProg = :nomeProg"),
    @NamedQuery(name = "BdTvsr.findByCanal", query = "SELECT b FROM BdTvsr b WHERE b.canal = :canal"),
    @NamedQuery(name = "BdTvsr.findByDuracao", query = "SELECT b FROM BdTvsr b WHERE b.duracao = :duracao"),
    @NamedQuery(name = "BdTvsr.findByHoraInicProg", query = "SELECT b FROM BdTvsr b WHERE b.horaInicProg = :horaInicProg"),
    @NamedQuery(name = "BdTvsr.findByDataProg", query = "SELECT b FROM BdTvsr b WHERE b.dataProg = :dataProg"),
    @NamedQuery(name = "BdTvsr.findByGeneroProg", query = "SELECT b FROM BdTvsr b WHERE b.generoProg = :generoProg"),
    @NamedQuery(name = "BdTvsr.findByImgProg", query = "SELECT b FROM BdTvsr b WHERE b.imgProg = :imgProg"),
    @NamedQuery(name = "BdTvsr.findByFlag", query = "SELECT b FROM BdTvsr b WHERE b.flag = :flag")})
public class BdTvsr implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PROG")
    private Long idProg;
    @Column(name = "NOME_PROG")
    private String nomeProg;
    @Column(name = "CANAL")
    private String canal;
    @Column(name = "DURACAO")
    @Temporal(TemporalType.TIME)
    private Date duracao;
    @Column(name = "HORA_INIC_PROG")
    @Temporal(TemporalType.TIME)
    private Date horaInicProg;
    @Column(name = "DATA_PROG")
    @Temporal(TemporalType.DATE)
    private Date dataProg;
    @Column(name = "GENERO_PROG")
    private String generoProg;
    @Column(name = "IMG_PROG")
    private String imgProg;
    @Column(name = "FLAG")
    private Boolean flag;

    public BdTvsr() {
    }

    public BdTvsr(Long idProg) {
        this.idProg = idProg;
    }

    public Long getIdProg() {
        return idProg;
    }

    public void setIdProg(Long idProg) {
        Long oldIdProg = this.idProg;
        this.idProg = idProg;
        changeSupport.firePropertyChange("idProg", oldIdProg, idProg);
    }

    public String getNomeProg() {
        return nomeProg;
    }

    public void setNomeProg(String nomeProg) {
        String oldNomeProg = this.nomeProg;
        this.nomeProg = nomeProg;
        changeSupport.firePropertyChange("nomeProg", oldNomeProg, nomeProg);
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        String oldCanal = this.canal;
        this.canal = canal;
        changeSupport.firePropertyChange("canal", oldCanal, canal);
    }

    public Date getDuracao() {
        return duracao;
    }

    public void setDuracao(Date duracao) {
        Date oldDuracao = this.duracao;
        this.duracao = duracao;
        changeSupport.firePropertyChange("duracao", oldDuracao, duracao);
    }

    public Date getHoraInicProg() {
        return horaInicProg;
    }

    public void setHoraInicProg(Date horaInicProg) {
        Date oldHoraInicProg = this.horaInicProg;
        this.horaInicProg = horaInicProg;
        changeSupport.firePropertyChange("horaInicProg", oldHoraInicProg, horaInicProg);
    }

    public Date getDataProg() {
        return dataProg;
    }

    public void setDataProg(Date dataProg) {
        Date oldDataProg = this.dataProg;
        this.dataProg = dataProg;
        changeSupport.firePropertyChange("dataProg", oldDataProg, dataProg);
    }

    public String getGeneroProg() {
        return generoProg;
    }

    public void setGeneroProg(String generoProg) {
        String oldGeneroProg = this.generoProg;
        this.generoProg = generoProg;
        changeSupport.firePropertyChange("generoProg", oldGeneroProg, generoProg);
    }

    public String getImgProg() {
        return imgProg;
    }

    public void setImgProg(String imgProg) {
        String oldImgProg = this.imgProg;
        this.imgProg = imgProg;
        changeSupport.firePropertyChange("imgProg", oldImgProg, imgProg);
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        Boolean oldFlag = this.flag;
        this.flag = flag;
        changeSupport.firePropertyChange("flag", oldFlag, flag);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProg != null ? idProg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BdTvsr)) {
            return false;
        }
        BdTvsr other = (BdTvsr) object;
        if ((this.idProg == null && other.idProg != null) || (this.idProg != null && !this.idProg.equals(other.idProg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.BdTvsr[ idProg=" + idProg + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
