package tsou.cn.lib_base.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/12/4 0004.
 */

public class EventBusBean implements Parcelable {
    private String project;
    private int num;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.project);
        dest.writeInt(this.num);
    }

    public EventBusBean() {
    }

    protected EventBusBean(Parcel in) {
        this.project = in.readString();
        this.num = in.readInt();
    }

    public static final Parcelable.Creator<EventBusBean> CREATOR = new Parcelable.Creator<EventBusBean>() {
        @Override
        public EventBusBean createFromParcel(Parcel source) {
            return new EventBusBean(source);
        }

        @Override
        public EventBusBean[] newArray(int size) {
            return new EventBusBean[size];
        }
    };
}
