package wolvesofwallstreet.UFS.ufsclinic;

import java.util.Date;

public class Appointment {
    private String sOrganisation, appointmentReason;
    private Date appointmentDateTime;

    public Appointment(String _organisation, String _appointmentReason, Date appointmentDateTime)
    {
        sOrganisation = _organisation;
        appointmentReason = _appointmentReason;
        appointmentDateTime = appointmentDateTime;

    }

    public String getOrganisation() {
        return sOrganisation;
    }

    public void setOrganisation(String _organisation) {
        this.sOrganisation = _organisation;
    }

    public String getAppointmentReason() {
        return appointmentReason;
    }

    public void setAppointmentReason(String _appointmentReason) {
        this.appointmentReason = _appointmentReason;
    }

    public Date getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(Date _appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }
}
