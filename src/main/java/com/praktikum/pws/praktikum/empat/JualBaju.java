/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.pws.praktikum.empat;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author SWMahardhika
 */
@Entity
@Table(name="baju")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class JualBaju implements Serializable {
    @Id
    private String id_baju;
    private String merek;
    private String ukuran;
    private String harga;
}
