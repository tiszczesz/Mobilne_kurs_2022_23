package com.example.roomappv1

import androidx.room.*

@Dao
interface StudentDao {

    @Query("SELECT * FROM student_table")
    fun getAll():List<Student>

    @Query("SELECT * FROM student_table WHERE roll_no LIKE :roll LIMIT 1")
    fun findByRoll(roll:Int):Student?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(student: Student)

    @Delete
    suspend fun delete(student: Student)

    @Query("DELETE FROM student_table")
    suspend fun deleteAll()
}