/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;




public class Limelight extends SubsystemBase {
  NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  NetworkTableEntry tx = table.getEntry("tx");
  NetworkTableEntry ty = table.getEntry("ty");
  NetworkTableEntry ta = table.getEntry("ta");

  double x = tx.getDouble(0.0);
  double y = ty.getDouble(0.0);
  double area = ta.getDouble(0.0);

  System.out.println("LimelightX:" + LimelightX "LimelightY:"  + LimelightY + "LimelightArea:" + LimelightArea);

  // public static NetworkTableInstance tableInstance = NetworkTableInstance.getDefault();
  // public static NetworkTable table = tableInstance.getTable("Limelight");
  
  //   public final static int kDefaultPipeline = 0; //Pipeline: the connection for limelight
  //   public final static int kSortTopPipeline = 1;

  //   public static class LimelightConstants{
  //     public String kTableName ="";

  //   private NetworkTable mNetworkTable;
    
  //   public void Limelight(final LimelightConstants constants){
  //     mConstants = constants;
  //     mNetworkTable = NetworkTableInstance.getDefault. getTable(constants.kTableName);
  //   }
    
    // }
  /**
   * Creates a new ExampleSubsystem
   */
 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
