/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //controlers
    public static int MAINDRIVECON = 0;

    public static int LEFTSTICKX = 0;
    public static int LEFTSTICKY = 1;
    public static int RIGHTSTICKX = 4;
    public static int RIGHTSTICKY = 5;

    public static final int Y = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int X = 3;
    public static int RIGHTBUMPER = 4;
    public static int LEFTBUMPER = 5;
    

    //drive train
    public static int LEFTMASTER = 0;
    public static int LEFTSLAVE = 1;
    public static int RIGHTMASTER = 2;
    public static int RIGHTSLAVE = 3;

    public static double MAXSPEED = 1;
    public static double MAXPRSPEED = .5;

    public static double DRIVEP = .1;
}
