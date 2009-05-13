# PIXHAWK console image
# Includes all packages and setting for the PIXHAWK system

require recipes/images/omap3-console-image.bb

IMAGE_INSTALL += " \
   opencv-dev \
   opencv-bin \
   opencv-apps \
   libusb \
   task-native-sdk \
   libdc1394 \
   nano \
   dhclient \
   grep \
   "

export IMAGE_BASENAME = "pixhawk-console-image"
