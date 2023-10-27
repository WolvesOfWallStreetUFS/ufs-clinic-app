package wolvesofwallstreet.UFS.ufsclinic;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class DatabaseHelper extends SQLiteOpenHelper {
    //Database Name
    private static final String DATABASE_NAME = "myUFSDB";
    private static final int DATABASE_VERSION = 1;

    //Student Credentials Table
    public static final String TABLE_STUDENTS = "StudentsTB";
    private static final String COLUMN_ID = "ID";
    public static final String COLUMN_EMAIL = "Student_Email";
    public static final String COLUMN_PASSWORD = "Password";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create Students Table
        String createTable = "CREATE TABLE " + TABLE_STUDENTS + "(" + COLUMN_ID +
                " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_EMAIL + " TEXT, " + COLUMN_PASSWORD + " TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);
        onCreate(db);
    }

    //Method To Login Students
    public boolean LoginUser(String Student_Email, String Password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String[] columns = {COLUMN_ID};
        String selection = COLUMN_EMAIL + " = ? AND " + COLUMN_PASSWORD + " = ?";
        String[] selectionArgs = {Student_Email, Password};

        Cursor cursor = db.query(TABLE_STUDENTS, columns, selection, selectionArgs,
                null, null, null);

        boolean result = cursor.getCount() > 0;

        cursor.close();
        db.close();

        return result;
    }

    //Method To Register New Student
    public long RegisterUser(String Student_Email, String Password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_EMAIL, Student_Email);
        values.put(COLUMN_PASSWORD, Password);

        long newRowID = db.insert(TABLE_STUDENTS, null, values);
        db.close();

        return newRowID;
    }
}