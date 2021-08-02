USE [APouchJ6_QuachDiemPhuoc]
GO
/****** Object:  Table [dbo].[chi_tiet_don_hang]    Script Date: 8/3/2021 1:47:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chi_tiet_don_hang](
	[mactdh] [bigint] NOT NULL,
	[gia] [float] NULL,
	[so_luong] [int] NULL,
	[madh] [bigint] NULL,
	[masp] [varchar](255) NULL,
	[idsp] [int] NULL,
 CONSTRAINT [PK__chi_tiet__50C3C2733AAFA9B8] PRIMARY KEY CLUSTERED 
(
	[mactdh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[don_hang]    Script Date: 8/3/2021 1:47:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[don_hang](
	[madh] [bigint] NOT NULL,
	[dia_chi] [varchar](255) NULL,
	[trang_thai] [int] NULL,
	[mand] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[madh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[gio_hang]    Script Date: 8/3/2021 1:47:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[gio_hang](
	[masp] [int] NOT NULL,
	[giasp] [float] NULL,
	[giam_gia] [float] NULL,
	[hinh_anh] [varchar](255) NULL,
	[kich_co] [varchar](255) NULL,
	[tensp] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[masp] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[loai_san_pham]    Script Date: 8/3/2021 1:47:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[loai_san_pham](
	[ma_loai] [varchar](255) NOT NULL,
	[ghi_chu] [varchar](255) NULL,
	[ten_loai] [nvarchar](255) NULL,
	[mansp] [varchar](255) NULL,
 CONSTRAINT [PK__loai_san__D9476E5721271C60] PRIMARY KEY CLUSTERED 
(
	[ma_loai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nguoi_dung]    Script Date: 8/3/2021 1:47:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nguoi_dung](
	[tentk] [varchar](255) NOT NULL,
	[email] [varchar](255) NULL,
	[dia_chi] [varchar](255) NULL,
	[hinh_anh] [varchar](255) NULL,
	[ho_ten] [varchar](255) NULL,
	[mat_khau] [varchar](255) NULL,
	[sodt] [int] NULL,
	[trang_thai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[tentk] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nhom_san_pham]    Script Date: 8/3/2021 1:47:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhom_san_pham](
	[ma_nhom] [varchar](255) NOT NULL,
	[ten_nhom] [nvarchar](255) NULL,
 CONSTRAINT [PK__nhom_san__9B8FD98CB6792A5D] PRIMARY KEY CLUSTERED 
(
	[ma_nhom] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[san_pham]    Script Date: 8/3/2021 1:47:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[san_pham](
	[masp] [varchar](255) NULL,
	[chi_tiet_hinh_anh] [nvarchar](1000) NULL,
	[giasp] [float] NULL,
	[giam_gia] [float] NULL,
	[hinh_anh] [varchar](255) NULL,
	[kich_co] [varchar](255) NULL,
	[mo_ta] [nvarchar](1000) NULL,
	[ngay_tao] [datetime2](7) NULL,
	[so_luong_ban] [int] NULL,
	[tensp] [nvarchar](255) NULL,
	[trang_thai] [bit] NULL,
	[video] [varchar](255) NULL,
	[mal] [varchar](255) NULL,
	[mansp] [varchar](255) NULL,
	[hinh_anh2] [varchar](255) NULL,
	[slide_hinh1] [varchar](255) NULL,
	[slide_hinh2] [varchar](255) NULL,
	[slide_hinh3] [varchar](255) NULL,
	[slide_hinh4] [varchar](255) NULL,
	[id] [int] NOT NULL,
 CONSTRAINT [PK__san_pham__7A2176729271DF5D] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tham_quyen]    Script Date: 8/3/2021 1:47:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tham_quyen](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[matk] [varchar](255) NULL,
	[vaitro_id] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[vai_tro]    Script Date: 8/3/2021 1:47:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[vai_tro](
	[mavt] [varchar](255) NOT NULL,
	[tenvt] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[mavt] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'NIKE AIR FORCE 1', NULL, N'NIKE AIR FORCE 1', N'NSP1')
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'NIKE AIR MAX', NULL, N'NIKE AIR MAX', N'NSP1')
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'NIKE AIR UPTEMPO', NULL, N'NIKE AIR UPTEMPO', N'NSP1')
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'NIKE AIR ZOOM PEGASUS', NULL, N'NIKE AIR ZOOM PEGASUS', N'NSP1')
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'NIKE BLAZER', NULL, N'NIKE BLAZER', N'NSP1')
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'NIKE JORDAN', NULL, N'NIKE JORDAN', N'NSP1')
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'NIKE M2K', NULL, N'NIKE M2K', N'NSP1')
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'NIKE SB DUNK', NULL, N'NIKE SB DUNK', N'NSP1')
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'YEEZY 350 V2', NULL, N'YEEZY 350 V2', N'NSP2')
INSERT [dbo].[loai_san_pham] ([ma_loai], [ghi_chu], [ten_loai], [mansp]) VALUES (N'YEEZY 700', NULL, N'YEEZY 700', N'NSP2')
GO
INSERT [dbo].[nhom_san_pham] ([ma_nhom], [ten_nhom]) VALUES (N'NSP1', N'NIKE')
INSERT [dbo].[nhom_san_pham] ([ma_nhom], [ten_nhom]) VALUES (N'NSP2', N'YEEZY')
INSERT [dbo].[nhom_san_pham] ([ma_nhom], [ten_nhom]) VALUES (N'NSP3', N'CONVERSE')
INSERT [dbo].[nhom_san_pham] ([ma_nhom], [ten_nhom]) VALUES (N'NSP4', N'VANS')
INSERT [dbo].[nhom_san_pham] ([ma_nhom], [ten_nhom]) VALUES (N'NSP5', N'MLB')
GO
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF03', NULL, 1700000, 798000, N'NIKE_AIR_FORCE_1.1/nike-air-force-1-low-replica-800x600.jpg', NULL, N'Form dáng quá đỗi đơn giản, basic, quen thuộc, dễ phối đồ là những lý do mà giày Af1 trắng luôn là 1 trong những mẫu bán chạy nhất tại shop. Nguyên liệu được sử dụng chuẩn chính hãng, tỷ lệ like Auth 99%, chuẩn đến từng đường may mũi chỉ, mời các bạn xem video và hình ảnh thực tế tại Shop.
', NULL, 50, N'Nike Air Force 1 trắng', 1, N'https://youtu.be/1VKwKYc8YaM', N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/nike-air-force-1-5-800x577.jpg', NULL, NULL, NULL, NULL, 1)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF04', NULL, 1400000, 798000, N'NIKE_AIR_FORCE_1.1/nike-just-do-it-replica-800x601.jpg', NULL, N'Các tín đồ sneaker không thể bỏ qua đôi Nike Af1 Just do It bởi tính sáng tạo, cá tính, chất chơi, không đụng hàng. (Nổi bật với họa tiết nổi bật đậm chất “Just do It”). Là một trong những đôi đang được giới trẻ ưa chuộng hiện nay.
', NULL, 50, N'Nike Air Force Just do It trắng', 1, NULL, N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/giay-nike-air-max-just-do-it-replica-4-800x600.png', NULL, NULL, NULL, NULL, 2)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF05', NULL, 1700000, 798000, N'NIKE_AIR_FORCE_1.1/nike-air-force-1-lv8-utility-replica-800x599.jpg', NULL, N'Form dáng quá đỗi đơn giản, basic, quen thuộc, dễ phối đồ là những lý do mà giày Af1 trắng luôn là 1 trong những mẫu bán chạy nhất tại shop. Nguyên liệu được sử dụng chuẩn chính hãng, tỷ lệ like Auth 99%, chuẩn đến từng đường may mũi chỉ, mời các bạn xem video và hình ảnh thực tế tại Shop.
', NULL, 50, N'Nike Air Force 1 ’07 Lv8 Utility’', 1, NULL, N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/nike-air-force-1-07-ultility-black-replica-6-800x600.png', NULL, NULL, NULL, NULL, 3)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF06', NULL, 1400000, 798000, N'NIKE_AIR_FORCE_1.1/nike-air-force-1-shadow-replica-800x600.jpg', NULL, NULL, NULL, 50, N'Nike Air Force 1 Shadow Pale Ivory (7 màu)', 1, N'https://youtu.be/GYHBjgt9y6k', N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/nike-air-force-1-shadow-replica-2-800x600.png', NULL, NULL, NULL, NULL, 4)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF09', NULL, 1400000, 798000, N'NIKE_AIR_FORCE_1.1/giay-nike-air-force-1-spruce-aura-replica-800x600.jpg', NULL, N'Giày AF1 “Daisy” hoa cúc cực cute cho các bạn nữ cá tính , nhìn có chút gì đó vừa rực rỡ bắt mắt, mà tổng thể thì vẫn thật nhẹ nhàng, sành điệu.
', NULL, 50, N'Nike Air Force 1 Shadow ‘Daisy’ Spruce Aura Custom', 1, NULL, N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/Nike-Air-Force-1-Shadow-Daisy-Spruce-Aura-2-800x600.png', NULL, NULL, NULL, NULL, 5)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF11', NULL, 2500000, 1290000, N'NIKE_AIR_FORCE_1.1/giay-nike-cactus-jack-travis-scott-low-replica-1-800x600.jpg', NULL, NULL, NULL, 50, N'Nike Air Force 1 Low Travis Scott Cactus Jack', 1, N'https://youtu.be/1DC89IrFCf8
', N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/Giay-Nike-Air-Force-1-Low-Travis-Scott-Cactus-Jack-7-800x600.png', NULL, NULL, NULL, NULL, 6)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF12', NULL, 1700000, 798000, N'NIKE_AIR_FORCE_1.1/giay-Nike-Air-Force-1-Shadow-Spruce-Aura-green-replica-800x600.jpg', NULL, NULL, NULL, 50, N'Nike Air Force 1 Shadow Aura Green', 1, NULL, N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/Giay-Nike-Air-Force-1-Shadow-Aura-Green-replica1-1-800x578.png', NULL, NULL, NULL, NULL, 7)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF14', NULL, 1400000, 798000, N'NIKE_AIR_FORCE_1.1/nike-air-force-1-shadow-triple-white-replica-800x600.jpg', NULL, NULL, NULL, 50, N'Nike Air Force 1 Shadow Triple White', 1, NULL, N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/Nike-af1-shadow-triple-white-800x600.png', NULL, NULL, NULL, NULL, 8)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF17', NULL, 1400000, 798000, N'NIKE_AIR_FORCE_1.1/NIKE-AIR-FORCE-1-07-LXX-VANDALIZED-800x600.jpg', NULL, NULL, NULL, 50, N'Nike Air Force 1 Vandalized Sail Mystic Green', 1, NULL, N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/Giay-Nike-Air-Force-1-Vandalized-Sail-Mystic-Green-replica1-800x600.png', NULL, NULL, NULL, NULL, 9)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF18', NULL, 1400000, 798000, N'NIKE_AIR_FORCE_1.1/517878_01.jpg-800x600.jpg', NULL, N'Giày AF1 “Daisy” hoa cúc cực cute cho các bạn nữ cá tính , nhìn có chút gì đó vừa rực rỡ bắt mắt, mà tổng thể thì vẫn thật nhẹ nhàng, sành điệu.
', NULL, 50, N'Nike Air Force 1 LX Vandalized White', 1, NULL, N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/giay-nike-air-force-1-vandalized-3-800x642.png', NULL, NULL, NULL, NULL, 10)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF19', NULL, 2500000, 990000, N'NIKE_AIR_FORCE_1.1/giay-nike-air-force-1-g-dragon-paranoise-2.0-replica-800x600.jpg', NULL, N'Nike Af1 G-D Para-Noise 2.0 là bản collab giữa Nike và G – Dragon được chính thức tung ra thị trường vào tháng 11 năm 2020 nhằm tiếp nối thành công vang dội của Para-Noise 1.0 trước đó.
Và cũng giống như phiên bản đầu tiên, Para-Noise 2.0 nhanh chóng “soul out” trên mọi mặt trận nhờ sức ảnh hưởng khủng khiếp của G – Dragon – “ông hoàng KPop”.
', NULL, 50, N'Nike Air Force 1 G-Dragon Peaceminusone Para-Noise 2.0', 1, NULL, N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/Nike-Air-Force-1-G-Dragon-Peaceminusone-Para-Noise-2-5-800x600.png', NULL, NULL, NULL, NULL, 11)
INSERT [dbo].[san_pham] ([masp], [chi_tiet_hinh_anh], [giasp], [giam_gia], [hinh_anh], [kich_co], [mo_ta], [ngay_tao], [so_luong_ban], [tensp], [trang_thai], [video], [mal], [mansp], [hinh_anh2], [slide_hinh1], [slide_hinh2], [slide_hinh3], [slide_hinh4], [id]) VALUES (N'NAF21', NULL, 1400000, 798000, N'NIKE_AIR_FORCE_1.1/Nike-Air-Force-1-LX-Tear-Away-Red-Swoosh-3-1.png', NULL, N'Nhà Nike đã tiếp tục tung ra một sản phẩm mới của dòng Air Force 1 có motif tương tự với đôi giày được ra mắt với năm ngoái G-Dragon x AF1 “Para Noise” hay Travis Scott x SB Dunk. Y như dự đoán, phong cách lớp upper có thể xé bỏ vẫn luôn thu hút mọi tín đồ thời trang, khiến đôi giày Nike Air Force 1 LX Tear Away trở nên hot hit hơn bao giờ hết.
', NULL, 50, N'Nike Air Force 1 LX Tear Away Red Swoosh', 1, NULL, N'NIKE AIR FORCE 1', N'NSP1', N'NIKE_AIR_FORCE_1.2/Nike-Air-Force-1-LX-Tear-Away-Red-Swoosh-2-1.png', NULL, NULL, NULL, NULL, 12)
GO
ALTER TABLE [dbo].[chi_tiet_don_hang]  WITH CHECK ADD  CONSTRAINT [FKodihdwuetirdvsli7a1oobwnq] FOREIGN KEY([madh])
REFERENCES [dbo].[don_hang] ([madh])
GO
ALTER TABLE [dbo].[chi_tiet_don_hang] CHECK CONSTRAINT [FKodihdwuetirdvsli7a1oobwnq]
GO
ALTER TABLE [dbo].[chi_tiet_don_hang]  WITH CHECK ADD  CONSTRAINT [FKskghb8ytxmkt67mp8e7rvyur9] FOREIGN KEY([idsp])
REFERENCES [dbo].[san_pham] ([id])
GO
ALTER TABLE [dbo].[chi_tiet_don_hang] CHECK CONSTRAINT [FKskghb8ytxmkt67mp8e7rvyur9]
GO
ALTER TABLE [dbo].[don_hang]  WITH CHECK ADD  CONSTRAINT [FKgej73ghlrwkrt2rdnc6htci65] FOREIGN KEY([mand])
REFERENCES [dbo].[nguoi_dung] ([tentk])
GO
ALTER TABLE [dbo].[don_hang] CHECK CONSTRAINT [FKgej73ghlrwkrt2rdnc6htci65]
GO
ALTER TABLE [dbo].[loai_san_pham]  WITH CHECK ADD  CONSTRAINT [FKrskuvo8t9eolhdqud5hnx894q] FOREIGN KEY([mansp])
REFERENCES [dbo].[nhom_san_pham] ([ma_nhom])
GO
ALTER TABLE [dbo].[loai_san_pham] CHECK CONSTRAINT [FKrskuvo8t9eolhdqud5hnx894q]
GO
ALTER TABLE [dbo].[san_pham]  WITH CHECK ADD  CONSTRAINT [FK13y9jnnn9g4b2mvi4yno942rw] FOREIGN KEY([mal])
REFERENCES [dbo].[loai_san_pham] ([ma_loai])
GO
ALTER TABLE [dbo].[san_pham] CHECK CONSTRAINT [FK13y9jnnn9g4b2mvi4yno942rw]
GO
ALTER TABLE [dbo].[san_pham]  WITH CHECK ADD  CONSTRAINT [FKhn1da1i1h6biymf29ri0m7jsw] FOREIGN KEY([mansp])
REFERENCES [dbo].[nhom_san_pham] ([ma_nhom])
GO
ALTER TABLE [dbo].[san_pham] CHECK CONSTRAINT [FKhn1da1i1h6biymf29ri0m7jsw]
GO
ALTER TABLE [dbo].[tham_quyen]  WITH CHECK ADD  CONSTRAINT [FK6cd9g9ojmexq6vmn86t2mbu6f] FOREIGN KEY([vaitro_id])
REFERENCES [dbo].[vai_tro] ([mavt])
GO
ALTER TABLE [dbo].[tham_quyen] CHECK CONSTRAINT [FK6cd9g9ojmexq6vmn86t2mbu6f]
GO
ALTER TABLE [dbo].[tham_quyen]  WITH CHECK ADD  CONSTRAINT [FKk9ax5v1wy512quxwcbf5gkvot] FOREIGN KEY([matk])
REFERENCES [dbo].[nguoi_dung] ([tentk])
GO
ALTER TABLE [dbo].[tham_quyen] CHECK CONSTRAINT [FKk9ax5v1wy512quxwcbf5gkvot]
GO
