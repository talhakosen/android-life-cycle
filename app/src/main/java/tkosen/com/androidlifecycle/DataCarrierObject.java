package tkosen.com.androidlifecycle;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tctkosen on 08/06/16.
 */
public class DataCarrierObject implements Parcelable{
    String name;
    String surname;
    String phone;
    String email;

    public DataCarrierObject() {
    }

    public DataCarrierObject(String email, String name, String phone, String surname) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.surname = surname;
    }

    protected DataCarrierObject(Parcel in) {
        name = in.readString();
        surname = in.readString();
        phone = in.readString();
        email = in.readString();
    }

    public static final Creator<DataCarrierObject> CREATOR = new Creator<DataCarrierObject>() {
        @Override
        public DataCarrierObject createFromParcel(Parcel in) {
            return new DataCarrierObject(in);
        }

        @Override
        public DataCarrierObject[] newArray(int size) {
            return new DataCarrierObject[size];
        }
    };

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(surname);
        dest.writeString(phone);
        dest.writeString(email);
    }
}
