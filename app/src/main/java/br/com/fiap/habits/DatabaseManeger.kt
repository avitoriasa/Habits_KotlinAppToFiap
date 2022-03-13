package br.com.fiap.habits

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DatabaseManeger(context: Context, input_login2: String) : SQLiteOpenHelper(context,input_login2,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val criarTabela : String = "CREATE TABLE tbl_email (" +
                "id_email STRING NOT NULL," +
                "email VARCHAR(20)," +
                "PRIMARY KEY (id_email);)

        db!!.execSQL(criarTabela))
    }
        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
            p0?.execSQL("DROP TABLE IF EXISTS tbl_email")

            p0?.execSQL("CREATE TABLE tbl_email(\n" +
                    "\tid_email INT NOT NULL,\n" +
                    "\tEMAIL VARCHAR(20),\n" +
                    "\tPRIMARY KEY (id_email)\n" +
                    "\t);")
        }

        fun insereEmail(id: Int, input_login2: String){
            var db = this.writableDatabase

            var cv = ContentValues()

            cv.put("id_email",id)

            db.insert("email","id_email",cv)
        }

    }

