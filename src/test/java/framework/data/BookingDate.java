package framework.data;

public class BookingDate {
  private String checkin;
  private String checkout;

  public BookingDate(String checkin, String checkout) {
    this.checkin = checkin;
    this.checkout = checkout;
  }

  public BookingDate() {
  }

  public String getCheckin() {
    return checkin;
  }

  public void setCheckin(String checkin) {
    this.checkin = checkin;
  }

  public String getCheckout() {
    return checkout;
  }

  public void setCheckout(String checkout) {
    this.checkout = checkout;
  }
}
